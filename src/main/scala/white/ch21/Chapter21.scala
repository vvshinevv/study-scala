package white.ch21

object Chapter21 extends App {
  def maxListOrdering[T](elements: List[T])(ordering: Ordering[T]): T =
    elements match {
      case List() => throw new IllegalArgumentException("empty list")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListOrdering(rest)(ordering)
        if (ordering.gt(x, maxRest)) x
        else maxRest
    }


  def maxListImplParam[T](elements: List[T])(implicit ordering: Ordering[T]): T = {
    elements match {
      case List() => throw new IllegalArgumentException("empty list")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListImplParam(rest)(ordering)
        if (ordering.gt(x, maxRest)) x
        else maxRest
    }
  }

  def maxList[T](elements: List[T])(implicit ordering: Ordering[T]): T = {
    elements match {
      case List() => throw new IllegalArgumentException("empty list")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxList(rest)
        if (ordering.gt(x, maxRest)) x
        else maxRest
    }
  }

  def maxListWithContextBound[T: Ordering](elements: List[T]): T =
    elements match {
      case List() => throw new IllegalArgumentException("empty list")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxList(rest)
        if (implicitly[Ordering[T]].gt(x, maxRest)) x
        else maxRest
    }
}
