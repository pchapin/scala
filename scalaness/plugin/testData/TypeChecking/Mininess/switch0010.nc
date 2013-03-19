
// The controlling expression has to be a subtype of UInt32 or Int32. The expression on each
// case has to be a constant expression that is a subtype of the controlling expression.
//
switch( x ) {
  case 0:
    y = z;
    break;
    
  case 1:
    y = z + 1;
    break;
    
  default:
    *p = 0;
}
