package scala.offheap
package internal

import scala.annotation.StaticAnnotation

final class Data extends StaticAnnotation
final class Variant extends StaticAnnotation
final class Parent(tag: Class[_]) extends StaticAnnotation
final class PotentialChildren(tags: Class[_]*) extends StaticAnnotation
final class ClassTag(tag: Any) extends StaticAnnotation
final class ClassTagRange(from: Any, to: Any) extends StaticAnnotation // > from <= to
final class ParentExtractor(tag: Class[_], value: Any) extends StaticAnnotation
final class PrimaryExtractor(value: Any) extends StaticAnnotation
final class UniversalExtractor(value: Any) extends StaticAnnotation
final class Field[T](name: String, after: Any,
                     annots: Annots, offset: Size) extends StaticAnnotation
final class Annots(annots: Any*) extends StaticAnnotation
final class Complete(any: Any) extends StaticAnnotation
final class Ctor extends StaticAnnotation
