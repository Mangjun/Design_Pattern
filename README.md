# Design_Pattern
Java 언어로 디자인 패턴 학습

- [Iterator](#iterator)
- [Adpater](#adapter)
- [Template_Method](#template-method)
- [Factory_Method](#factory-method)
- [Singleton](#singleton)
- [Prototype](#prototype)
- [Builder](#builder)

## Iterator
> for문의 **변수 i의 기능**을 추상화하여 일반화한 패턴   

<br>

* Iterator(반복자) : 요소를 순서대로 검색하는 인터페이스(API)를 결정 -> iterator
* ConcreteIterator(구체적인 반복자) : Iterator가 결정한 인터페이스(API)를 실제로 구현 -> BookShelfIterator
* Aggregate(집합체) : Iterator를 만들어 내는 인터페이스(API)를 결정 -> iterable
* ConcreteAggregate(구체적인 집합체) : Aggregate가 결정한 인터페이스를 실제로 구현 -> BookShelf

<br>

- 사용하는 경우 : 무엇인가 많이 모여 있을 때 이를 순서대로 가리키며 전체를 검색하고 처리를 반복하는 경우   
- 사용하는 이유 : 구현과 분리하여 클래스 재사용을 촉진   

<br>

## Adapter
> 비슷한 기존 클래스를 재사용하여 요구사항에 맞게 바꾸는 패턴   

<br>

- 상속을 사용한 패턴 : 직접 상속하여 사용 -> Java에서는 단일 상속만 가능하기 때문에 제약이 존재
- 위임을 사용한 패턴 : 필드로 가지기 때문에 별다른 제약이 없음

<br>

* Target(대상) : 지금 필요한 메소드를 결정 -> Print
* Adaptee(적응 대상자) : 재사용할 대상 -> Banner
* Adapter(적응자) : Adaptee의 메소드를 사용하여 Target을 만족 -> PrintBanner

<br>

- 사용하는 경우 : 버전 업을 할 때 또는 기존 클래스를 사용하여 요구된 API에 맞출 수 있을 경우  
- 사용하는 이유 : 버그에 대처하기 쉬움   

<br>

## Template Method
> 처리의 뼈대만 결정하고 실제 처리는 하위 클래스에서 하도록 하는 패턴   

<br>

* AbstractClass(추상 클래스) : 템플릿 메소드를 구현하고, 템플릿 메소드에서 사용할 추상 메소드를 선언 -> AbstractDisplay
* ConcreteClass(구현 클래스) : 추상 클래스의 추상 메소드를 구현 -> CharDisplay, StringDisplay

<br>

- 사용하는 경우 : 비슷한 기능이지만 구체적인 구현이 다를 경우   
- 사용하는 이유 : 상위 클래스에서 알고리즘을 작성하기 때문에, 하위 클래스에서 알고리즘을 일일이 적을 필요가 없어짐

<br>

## Factory Method
> 상위 클래스에서 Template Method를 통하여 뼈대를 구성하고 하위 클래스에서 구체적인 인스턴스를 생성하도록 하는 패턴   

<br>

* Product(제품) : 이 패턴으로 생성되는 인스턴스가 가져야 할 API를 선언 -> Product
* Creator(작성자) : Product를 생성하는 API를 선언 -> Factory
* ConcreteProduct(구체적인 제품) : Product의 API를 구현 -> IDCard
* ConcreteCreator(구체적인 작성자) : Creator의 API를 구현 -> IDCardFactory

<br>

- 사용하는 경우 : 구체적인 상품이 여러 개이고, 같은 API를 가져야 할 경우
- 사용하는 이유 : 확장에 유연함

<br>

## Singleton
> 클래스의 인스턴스를 딱 하나만 만드는 패턴   

<br>

* Singleton : 인스턴스를 얻기 위한 static 메소드를 선언 -> Singleton

<br>

- 사용하는 경우 : 인스턴스를 하나만 만들어야 할 경우
- 사용하는 이유 : 인스턴스가 하나뿐이라는 보장이 있다는 전제로 프로그래밍할 수 있음

<br>

## Prototype
> 복사해서 인스턴스를 만드는 패턴   

<br>

* Prototype(원형) : 인스턴스를 복사하여 새로운 인스턴스를 만들기 위한 메소드를 선언 -> Product
* ConcretePrototype(구체적인 원형) : Product의 메소드를 구현 -> MessageBox, UnderlinePen
* Client(이용자) : 인스턴스를 복사하는 메소드를 호출하여 인스턴스 생성 -> Manager

<br>

- 사용하는 경우 : 종류가 너무 많아서 정리할 수 없는 경우, 클래스로부터 인스턴스 생성이 어려운 경우, 프레임워크와 생성하는 인스턴스를 분리하고 싶은 경우
- 사용하는 이유 : 소스 프로그램을 관리하기 쉬워지고 프레임워크와 분리할 수 있음

<br>

## Builder
> 구조를 가진 인스턴스를 만들어 가는 패턴   

<br>

* Builder(건축가) : 인스턴스를 생성하기 위한 API를 결정 -> Builder
* ConcreteBuilder(구체적인 건축가) : Builder의 API를 구현 -> TextBuilder, HTMLBuilder
* Director(감독관) : Builder의 API를 사용하여 인스턴스 생성 -> Director

<br>

- 사용하는 경우 : 비슷한 기능을 하는 부품으로 교체할 가능성이 있을 경우
- 사용하는 이유 : 다른 부품으로 교체하는 데 비용이 들지 않음

<br>
