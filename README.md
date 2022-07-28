# Springboot_Exercise
Springboot_Exercise

## [gitignore.io](https://www.toptal.com/developers/gitignore/)

## 객체 지향 설계 (SOLID)
* SRP: 한 클래스는 하나의 책임만 가져야 한다.
* OCP: 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.
* LSP: 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다
* ISP: 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다
* DIP: 추상화에 의존해야지, 구체화에 의존하면 안된다

## Spring 
    Spring makes it easy to create Java enterprise applications. It provides everything you
    need to embrace the Java language in an enterprise environment, with support for
    Groovy and Kotlin as alternative languages on the JVM, and with the flexibility to create
    many kinds of architectures depending on an application’s needs
 
    스프링은 엔터프라이즈 애플리케이션을 만드는데 필요한
    거의 모든 요소를 지원해주는 프레임워크
### 핵심 기능
1. [The IoC Container](https://ko.wikipedia.org/wiki/%EC%A0%9C%EC%96%B4_%EB%B0%98%EC%A0%84)
2. Resources
3. Validation, Data Binding, and Type Conversion
4. Spring Expression Language (SpEL)
5. Aspect Oriented Programming with Spring
6. Null-safety
7. Logging

#### 라이브러리 vs 프레임워크
    라이브러리를 사용할 때는 내 코드가 라이브러리 코드를 호출하지만
    프레임워크를 사용할 때는 프레임워크가 내 코드를 호출한다.