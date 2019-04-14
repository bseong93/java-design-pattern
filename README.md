# Java Design Patterns
Languages
* [Korean](#전략-패턴)
* [English](#strategy-pattern)
<br/><br/><br/>

<hr/>
<br/><br/><br/>

## 전략 패턴
특정 목적의 알고리즘들을 정의 및 캡슐화하여 이들을 대상에 상호 교체가 가능하도록 만드는 전략.
<br/><br/><br/>

## 어댑터 패턴
기본로직의 변경없이 필요한 형태로 바꿔서 사용가능하도록 하는 전략.
<br/><br/><br/>

## 템플릿 메소트 패턴
슈퍼 클래스에서 로직의 기본적인 흐름을 정의하고, 세부 적인 메소드는 서브 클래스에서 `overriding`해 정의하는 것.
<br/><br/><br/>

## 팩토리 메소드 패턴
`new` 키워드 호출을 서브 클래스에 위임 하는 것. 즉, 객체 생성방법을 서브 클래스에서 결정하는 것.
<br/><br/><br/>

## 싱글톤 패턴
객체가 사용될 때마다 생성하는 것이 아니라 하나의 객체 인스턴스로 사용하는 전략.<br/>
장점 : 메모리 낭비를 방지할 수 있다.<br/>
단점 : 객체지향설계원칙에 맞지 않기 때문에 수정과 테스트가 어려워진다.
<br/><br/><br/>

## 프로토타입 패턴
생성에 큰 비용이 드는 객체에 대해 생성요청이 많은 경우 사용한다.<br/>
미리 만들어진 객체를 복사하여 생성하는 전략이다.
<br/><br/><br/>

## 빌더 패턴
많은 멤버변수를 가지는 객체의 생성을 단순화함으로써 간결하고 직관적인 코드를 쓸 수 있다.
<br/><br/><br/>

## 추상 팩토리 패턴
인터페이스를 이용해 서로 의존하는 객체들을 하나의 그룹으로 만들어 한꺼번에 교체할 수 있는 전략이다.
<br/><br/><br/>

<hr/>
<br/><br/><br/>

## Strategy Pattern
A strategy that defines and encapsulates algorithms for specific purposes so that they can be interchanged with targets.
<br/><br/><br/>

## Adapter Pattern
A strategy that enables users to switch to the required form without changing the basic logic.
<br/><br/><br/>

## Template Method Pattern
A strategy that defines the basic flow of logic in a super class and that defines a detailed method as 'overriding' in a subclass.
<br/><br/><br/>

## Factory Method Patttern
Delegating a `new` keyword call to a subclass; that is, determining how an object is created in a subclass.
<br/><br/><br/>

## Singleton Pattern
A strategy that you use as an instance of an object rather than creating it every time it is used.<br/>
Advantages: Memory waste can be prevented.<br/>
Disadvantages: Because it does not conform to object oriented design principles, modification and testing become difficult.
<br/><br/><br/>

## Prototype Pattern
It is used when there are many requests for generation for objects that are costly to create.<br/>
A strategy that creates by copying pre-made objects.
<br/><br/><br/>

## Builder Pattern
By Simplifying the creation of objects with many membership variables we can write short and intuitive code.
<br/><br/><br/>

## Abstract Factory Pattern
Its strategy is to make objects that depend on each other into one group and replace them all at once.
<br/><br/><br/>