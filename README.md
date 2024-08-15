# Design_Pattern
Java 언어로 디자인 패턴 학습

- [Iterator](#iterator)

## Iterator
> for문의 **변수 i의 기능**을 추상화하여 일반화한 것   
<br>

사용하는 경우 : 무엇인가 많이 모여 있을 때 이를 순서대로 가리키며 전체를 검색하고 처리를 반복하는 것

<br>

* Iterator(반복자) : 요소를 순서대로 검색하는 인터페이스(API)를 결정 -> iterator
* ConcreteIterator(구체적인 반복자) : Iterator가 결정한 인터페이스(API)를 실제로 구현 -> BookShelfIterator
* Aggregate(집합체) : Iterator를 만들어 내는 인터페이스(API)를 결정 -> iterable
* ConcreteAggregate(구체적인 집합체) : Aggregate가 결정한 인터페이스를 실제로 구현 -> BookShelf

<br>

사용하는 이유 : 구현과 분리하여 클래스 재사용을 촉진