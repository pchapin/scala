
// for( init; condition; loop ) { ... }
//
// init expression evaluated once at start of loop.
// condition evaluated at start of each pass. Loop continues only if condition true.
// loop expression evaluated at the end of each pass.
//
// init and loop can be arbitrary expressions. condition must be a subtype of UInt32 or Int32.

for( x = 0; x < 10; ++x ) {
    a[x] = 0;
}
