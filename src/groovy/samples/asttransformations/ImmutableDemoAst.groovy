package groovy.samples.asttransformations

import groovy.transform.Immutable

@Immutable
class Point {
int x
int y
}
Point p = new Point(3,4)
println p.getX()