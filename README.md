# Spring-digitalGoverment-study

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
      - 위는 Spring 5.0 에서 적극적으로 추진하고 있는 테마
      - 글로벌한 공룡IT기업들(Netflix, Facebook 등...) 이 reactive한 시스템들을 적용중.. 우리나라는 시기상조..
      
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
      
   > ![Spring구조](https://user-images.githubusercontent.com/56371387/83330366-57991d80-a2c9-11ea-90dc-f3aa26bf4bee.PNG)
   
   > ![Layered 그림](https://user-images.githubusercontent.com/56371387/83330479-2a00a400-a2ca-11ea-8d00-9e8c52a240ea.PNG)

   > Java8 vs Java9
   
      - 기존에 있던 클래스들 일부 제외
      - Java9 이후 버젼들은 Java9과 거의 동일
    
   
   
          
      
      
  
