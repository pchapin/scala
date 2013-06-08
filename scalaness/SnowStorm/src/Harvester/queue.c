#include<stdio.h>

#define MAX_Q_SIZE 25
#define TRUE 1
#define FALSE 0

typedef struct aqueue 
{
  int elements[MAX_Q_SIZE];
  int size;
  int front;
  int back;
} queue_t;

// START QUEUE LIB FUNCTIONS
void init(queue_t* q)
{
  q->size = 0;
  q->front = 0;
  q->back = 0;
}

int is_full(queue_t* q)
{
  return (q->size >= MAX_Q_SIZE);
}

int is_empty(queue_t* q)
{
  return (q->size == 0);
}

void enqueue(int v, queue_t* q)
{
  if (is_full(q)) return;
  
  q->elements[q->back] = v;
  
  q->size++;
  q->back = (q->back + 1) % MAX_Q_SIZE;
}

int dequeue(queue_t* q)
{
  int v;
  
  if (is_empty(q)) return 0;
  
  v = q->elements[q->front];
  
  q->size--;
  q->front = (q->front + 1) % MAX_Q_SIZE;
  
  return v;
}

int enqueued(int v, queue_t* q)
{
  int i;
  
  for (i = 0; i < q->size; i++)
    {
      if (v == q->elements[(i + q->front) % MAX_Q_SIZE]) return TRUE;
    }
  return FALSE;
}
// END QUEUE LIB FUNCTIONS

main()
{
  queue_t q;
  int i;
  int k;

  init(&q);
 
  for (i = 0; i < 15; i++)
    {
      enqueue(i * 10, &q);
    }
 
  for (i = 0; i < 5; i++)
    {
      // k = dequeue(&q);
      // printf("first dequeued %i\n", k);
    }
  
  for (i = 0; i < 30; i++)
    {
      enqueue(i * 100, &q);
    }

  printf("OK %i\n", q.size);
  
  while (!is_empty(&q))
    {
      k = dequeue(&q);
      printf("dequeued %i\n", k);

      printf("OK %i\n", q.size);
    }

  enqueue(301, &q);
  
  if (enqueued(301, &q)) printf("OK %i\n", q.size);
}

