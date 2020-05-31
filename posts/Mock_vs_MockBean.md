# @Mock과 @MockBean의 차이에 대해 알아보자.



Mock을 활용해 테스트 코드를 짜다가 각 어노테이션을 언제 써야 하는지 궁금해졌다.

우선! 기본적으로 둘은 출처가 다르다.



**@Mock**

- Mockito에서 제공하는 어노테이션, `@ExtendWith(MockitoExtension.class)`를 활용해 사용할 수 있다.

- 이 어노테이션이 붙은 객체를 가짜로 만들어준다.

![image-20200531021144752](/Users/yebin/Library/Application Support/typora-user-images/image-20200531021144752.png)



**@MockBean**

- Spring 진영에서 mock 테스트를 좀 더 쉽게 하기 위해 나온 개념, `@ExtendWith(SpringExtension.class)`를 활용해 사용할 수 있다.

- 객체를 가짜로 만들어줌과 동시에 그 가짜 객체를 bean으로 등록한다. (Mock + Bean)

  ✔️ autowired가 가능하다.

![image-20200531021205061](/Users/yebin/Library/Application Support/typora-user-images/image-20200531021205061.png)





> 그럼 언제 @Mock을 쓰고, 언제 @MockBean을 써야 할까?

결론부터 말하자면, Spring의 관리가 필요하지 않을 때 (Spring과 관련 없는 테스트일 때) `@Mock`을 사용하자. 그리고 테스트에서 Spring 환경이 필요할 때 (bean으로 띄워서 Spring의 관리가 필요할 때) `@MockBean`을 사용하자.



@ExtendWith(MockitoExtension.class)보다 @ExtendWith(SpringExtension.class)가 훨씬 빠르다.

![image-20200601020036796](/Users/yebin/Library/Application Support/typora-user-images/image-20200601020036796.png)

![image-20200601020247676](/Users/yebin/Library/Application Support/typora-user-images/image-20200601020247676.png)

예를 들어보자.

![image-20200531022405121](/Users/yebin/Library/Application Support/typora-user-images/image-20200531022405121.png)



이렇게 MemberService 안에 `@Autowired`로 자동 주입 받는 (=스프링의 관리를 받는) 필드가 있다.

