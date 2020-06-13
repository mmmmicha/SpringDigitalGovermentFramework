# SpringDigitalGovermentFramework

<h1>1일차</h1>

   > SI
  
      시스템 통합개발
      
   > 웹서비스 ≒ 분산 서비스(불특정 다수가 대상)
  
   > Spring 의 탄생
  
      - J2EE Development without EJB(서버쪽 컴포넌트, 개발자 중심이 아니었다)
      - '로드 존슨' 이라는 사람이 'Spring' 이라는 것을 대략 선보이고 2003년 부터 이를 예찬하는 사람들이 오픈소스 개발에 참여하여 프레임워크로 발전
      - 온전히 '개발자'들을 위한 관점에서 지속 개발 중
      - Spring 의 핵심 : 분산컴포넌트를 지원 => DI/IOC 를 통해
          ※ 컴포넌트 : Spring 컨테이너가 첫 로딩될 때 함께 로딩되는 객체들(ex. Service, Controller, Repository 등..)
          
   > Spring Technology
   
      - Spring Data : 표준화된 인터페이스로 다양한 DBMS를 다룰 수 있음.
      - Spring Cloud : microservice 기반. "Netflix" 가 개발한 이 opensource를 tailering하여 제작.
      - Spring Cloud Data Flow : "쿠버네티스" 처럼 Container 컨트롤을 가능케 하는 기능.
      - Spring Batch : 보통 통신사, 카드사 등에서 사용. 시간순서대로 대량의 데이터를 처리하기 위함. 유통업에서도 매우 정교하게 사용.
      - Spring Kafka : Queue 를 이용한 데이터처리
      - Spring Boot
          - Spring Project의 Best Practice 에 대한 환경설정들을 처음부터 제공해주고 기호에 따라 수정하는 것.
          - Spring Framework 를 위한 Wrapper 느낌.
          - '공통' 의 역할이 이로인해 상당히 많이 줄게 되었음.
              ※ Spring, JVM 은 극강의 최적화가 되어있음. 더한 최적화를 위해서 지속적으로 노력하고 있음.
          - tomcat 내장
              - 'jar' 로 패키징해야만 톰캣을 내장함.
              ※ tomcat 과 Jeus 중 tomcat이 성능 압승이다.
              
          - 설정을 최대한 줄이고, xml설정 필요없음
          - Convention over configuration을 따름 => 설정보다 관습!
              
      
   > Devops
   
      - Developer + Operations
      - 개발자와 정보기술 전문가간의 소통, 협업 및 통합을 강조
      
   > Doker
   
      - 하나의 서버를 컨테이너로 관리
      - 한 사람이 수천개의 서버를 관리할 수 있음
      - Doker 의 상위개념이 "쿠버네티스"
      
   > Realtime의 시대
   
      - Data가 수집되는 즉시 분석 후 피드백!
      
   > BigData 시대
   
      - 데이터를 빠르게 처리하려면 '비동기'(reactive) 시스템을 적용해야함
          ※ reactive는 구성하는 모든부분들이 reactive여야 비로소 효과가 있다.
      - 위는 Spring 5.0 에서 적극적으로 추진하고 있는 테마
      - 글로벌한 공룡IT기업들(Netflix, Facebook 등...) 이 reactive한 시스템들을 적용중.. 우리나라는 시기상조..
      - 단순히 데이터가 많다보다 대량의 처리를 할 수 있는 능력이 생겼다는 것에 주목!
      - hadoop은 어플리케이션메모리에서 데이터를 가공
            - 원래는 DB에서 데이터를 몽땅 처리(이 패러다임을 바꿈)
            - 즉, DBMS와 어플리케이션 둘 다에서 데이터를 처리
            - hadoop은 설치만 80%(요새는 이를 cloud가 다 처리함)
                  ※ 하둡은 계산방식으로 '맵리듀스' 를 사용함
                  ※ ANSI SQL : ANSI(미국표준협회)에서 지정한 표준 SQL 문법. 모든 DBMS에 호환.
      
   > Spring Framework의 특징
   
      - 컨테이너 : 객체의 LifeCycle을 관리
      - DI : Dependency를 자동으로 해줌(Inversion of Control 에 의해) <- 설정파일, 어노테이션 이용
          - 어노테이션 : 선언적 프로그래밍(ex. SQL) <- '내부로직은 알아서하고 결과물만 내놔!'
          - '어노테이션' 덕분에 환경설정이 거의 사라지고 설정과 개발의 경계가 허물어졌음
      - AOP
      - POJO(Plain Old Java Object)
          - 컴포넌트 기법 : 상속x, 컴포넌트 그자체.
          - 인터페이스를 구현하지 않음.
      - 트랜잭션처리를 위한 일관된 방법을 지원. 표준화된 코드로 알아서 지원해줌!
      - 영속성과 관련된 다양한 API 지원
      - ORM도 지원(Hibernate 등..)
      - TDD(Test Driven Development)를 지향
          - Spring의 Base는 Test!
          
      ※ 참고! 프로그램의 대부분 메모리는 DB메모리이다. 결국 DB 내 처리가 얼마나 빨리 이루어지는가에 달렸다.
      ※ 참고! Spring에서 JSP는 우선순위가 매우낮다. 다양한 프런트 프레임워크들을 사용한다.(ex. Thymeleaf..)
      
   > ![Spring구조](https://user-images.githubusercontent.com/56371387/83330366-57991d80-a2c9-11ea-90dc-f3aa26bf4bee.PNG)
   
   > ![Layered 그림](https://user-images.githubusercontent.com/56371387/83330479-2a00a400-a2ca-11ea-8d00-9e8c52a240ea.PNG)

   > Java8 vs Java9
   
      - 기존에 있던 클래스들 일부 제외
      - Java9 이후 버젼들은 Java9과 거의 동일
    
   > Jet-Brains
   
      STS, InteliJ 를 만든 회사
      
   > Maven
   
      - 개발환경, 배포환경을 관리해주는 툴
      - 이전엔 Ant 를 사용(절차지향)
      - Maven Central Repository
          - Java의 거의 모든 library가 저장되어 있음.
          - maven 은 여기에서 library를 다운로드받아 프로젝트에 적용함.
      - 프로젝트의 directory를 정해줌
          - maven 기반의 프로젝트들은 directory구조가 거의 비슷함.
      - xml 설정파일
          - pom.xml : maven의 library를 등록하는 곳
          - xml때문에 maven 이 위기를 맞음 => gradle 탄생의 배경(maven과 기능은 거의 일치)
      - 라이브러리 설정
          - <dependencies> : <dependency>들을 품고있는 부모 태그
          - pom.xml에 dependency를 복붙하고 maven refresh를 하면 설치완료.
               ※ Mybatis Spring Boot Starter : Mybatis + Mybatis Spring
               ※ -spring -boot -starter : 관련 library를 전부 설치해주는 spring의 기능.
        
   > ![component 그림](https://user-images.githubusercontent.com/56371387/83330859-fa9f6680-a2cc-11ea-994a-bd1309a99365.PNG)

-----------------------------------------------------------------------------------------------------------------------------

<h1>2일차</h1>

  > keyword
  
      1. DI
      2. Layered Architecture
      3. Spring Core
          - 성능향상
          - 개발의 편의성
          - '컴포넌트'를 관리하기 위한 Container
              - 컴포넌트는 POJO이다.(@Autowired)
              - 종류
                  - @Component : 아래 컴포넌트들의 상위 어노테이션
                  - @RestController(@Controller의 하위) : Controller의 return이 자동적으로 JSON으로 변형된다(응답헤더를 json)
                  - @Service
                  - @Repository
                  
   > Spring5
   
      - Spring MVC -> Web Flux
          - Spring MVC
              - 매우 구조가 단순
              - annotation 자주 사용
          - Web Flux
              - reactive
              - annotaion이 매우 적어짐
              
   > PHP
   
      - 서버사이드 언어
      - 규모가 큰 프로젝트는 못함. 돈이 안됨
      - 라라벨 : PHP 기반 MVC를 구현한 프레임워크
      
   > Naming rule
   
      - 각 '컴포넌트' 는 postfix에 컴포넌트명을 꼭 써서 naming을 해야함.(ex. helloController..)
      - 각 '컴포넌트'를 호출하는 컴포넌트의 관점에서 naming을 할 것.(ex. Service의 naming은 Controller 관점..)
      
   > Value Object(≒ Domain Object, Model Object)
   
      - naming은 딱 '명사'만
      - postfix가 없음
      
   > MongoDB(NoSQL)
   
      - JSON DB
      - json을 Query로 파싱할 필요없이 그 자체로 담아버림(insert)
      
   > 전자정부프레임워크 Layered 특성
   
      - Service 컴포넌트 정도만 interface를 사용함(필수는 아니고 옵션)
      
   > RESTful API
   
      - method 종류
          - POST
          - GET
          - PUT
          - DELETE
          
      - @PathVariable Type 변수명
          - 'TYPE' 부분은 타입의 보장이 될 경우 알아서 캐스팅을 해줌
              (ex. get으로 넘어오는 데이터는 무조건 String인데 int 로 type 을 지정해놓을 경우 알아서 casting함)
              ※ 주의할점! 그 String이 숫자라는게 보장이 되어야함. 아닐경우 Error
              
      - @GetMapping("teams/{teamId}/players/{playId}) <- 예시
          (ex. 마블코믹스 API, soccer API.. )
          
      - PostMan Chrome(테스트 툴)
          - post로 테스트할 경우 raw, JSON(application/JSON) 으로 설정
          
      - @RequestBody
          - 클라이언트에서 JSON 데이터가 왔을 때 이를 받기위한 어노테이션
          
      - SOAP
          - RESTful Architecture로 세대교체 되기 전 모델
          - XML에 데이터를 실어서 통신
          - 브로커방식(UDDI)
          - 동작, 프로세싱에 집중(RESTful은 데이터처리에 집중)
              => 수년간 쌓인 데이터는 대체할 수 없다! <- 데이터의 중요성.
              
   > Stateless
   
      - No session
          - 인증은 API Key 또는 Token 으로 대체
      - Cacheable
          - Http프로토콜의 Caching 기능을 적용
          - "Last-Modified", "e-태그"를 이용
          
   > ![캡처](https://user-images.githubusercontent.com/56371387/83342711-89dc6680-a32d-11ea-91f1-a948a584bb54.PNG)
   
   > ![캡처2](https://user-images.githubusercontent.com/56371387/83342738-e17ad200-a32d-11ea-9667-920330f6fbd3.PNG)

-----------------------------------------------------------------------------------------------------------------------------

<h1>3일차</h1>

   > lombok 라이브러리
   
         - Immutable 객체
               - setter가 없는 bean
               - '원본을 그대로 보존하겠다' 는 의미
               - 복사본으로 데이터를 조작하기 때문에 rollback 이 가능하고 오류가 적어지며, 신뢰도가 높아짐
   
   > DTO(Data Transfer Object) Design pattern
   
         - Serializable 인터페이스 지원(MVC에선 쓸일이 거의 없음)
         - Immutable 객체
         
   > JSON
         
         - Jackson 라이브러리(Springboot에 내장)
         - JSON <-> Java 객체
         
   > Generic
   
         ※ 참고! List<User> : List of User 로 읽어짐.
         
   > 함수형 프로그래밍(≒ 선언적 프로그래밍)
   
         - 대표적으로 Java의 람다
               - .filter : SQL에서 where와 비슷한 역할
         - 객체프로그래밍은 데이터처리에 불리
         - 요새 Java엔 함수형 프로그래밍이 부분적으로 도입됨
               - ex. spark(빅데이터에서 )
         - .Net(C#)은 이미 2006년도에 함수형 프로그래밍이 적용(역시 MS..)
               - LINQ라는 기술.
               - SQL이랑 매우 흡사
         
   > JDBC(JDK 1.2에서 부터 도입)
   
         - SpringJDBC, Mybatis 등이 JDBC를 wrapping 해서 효율성을 많이 높임.
         - Connection pool
               - 커넥션을 여러개 만들어두고 쓰고 반납(release)
               - 요새 opensource에선 Connection pool 방식을 많이 씀
         - DataSource
               - 데이터베이스의 추상객체(Connection, Connection pool이 포함되어 있음)
               - 즉, Connection은 DataSource로!
               - hikariCP
                     - Connection pool 오픈소스
                     - Spring Boot 2.0 이후 라이브러리 내장(Default)
               - 설정 방법
                     - application.properties 에 구체적 내용 설정
                     - @Configuration : 환경설정 component
                     - @PropertySource("classpath : /application.properties")
                     - @Bean(Java 지원) ≒ @Component(Spring 지원)
         - Mybatis
               - dataSource를 알아서 메모리에 올려서 씀
               - @Repository, @Mapper
                     - Dao interface에 사용
               - <foreach> : where IN 조건에 많이 사용함
         
         ※ 참고! Sequence는 오라클에만 있다!
         
   > RESTful Test
   
         - JUnit
               - Java에서 독립된 단위테스트를 지원해주는 프레임워크
                     - 단위테스트 : 의도된대로 정확히 동작하는지 확인하는 절차
                     ※ 참고! test폴더는 main폴더를 mirroring해서 만들어짐.
               - @SpringBootTest
                     - Test를 위해 Spring Container를 띄워줌
               - Assertions 를 통해 단위테스트를 여러개 만들어주고 빌드할 때마다 실행되도록 하는것이 바람직.
               - @Test
                     - 테스트해볼 각 메소드 위에 표시
               - MockMVC
                     - Controller 테스트는 좀 다름. 그래서 postMan을 많이 사용함
    
   > Log4J(로그오픈소스) vs LogBack
         
         - Log4J(Spring Default)
         - LogBack Framework(SpringBoot Default)
         
         ※ 참고! 요새는 코어가 많아서 '코어 하나당 쓰레드 하나' 로 병렬컴퓨팅을 함.(멀티쓰레딩x)
               - 멀티쓰레딩은 그자체로 오버헤드인 경우가 많음.
               - 쓰레드 하나로 비동기방식을 사용함(요새 Best)
               
   > ![캡처3](https://user-images.githubusercontent.com/56371387/83343367-505b2980-a334-11ea-9b18-ad41bfffc285.PNG)
               
-----------------------------------------------------------------------------------------------------------------------------
      
<h1>4일차</h1>

   > Exception
   
         - 기존 자바는 Checked Exception concept이라 try ~ catch가 필수
         - spring, C# 은 unchecked Exception(런타임 Exception) 이라 try ~ catch가 필요없음
               - Spring의 경우 Entry point에 몰아서 한꺼번에 처리함.
         - @ControllerAdvice
         - @ExceptionHandler
         - @RestControllerAdvice  = @ControllerAdvice + @RestController
         
   > ![캡처4](https://user-images.githubusercontent.com/56371387/83343436-2ce4ae80-a335-11ea-9919-72b1305ab7bf.PNG)

   > AOP
   
         - AspectJ(구버전 AOP) vs Spring AOP
               - AspectJ : 너무 근본적임(현실적x)
               - Spring AOP : 현실적임
