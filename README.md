# clean-architecture-impl
'로버트 C. 마틴' 의 책 "클린 아키텍처" 에서 나오는 클린 아키텍처를 설명을 따라 직접 구현해보았습니다.

책에 나온 설명은 다음과 같습니다.

> ## 전형적인 시나리오
> 
> 아래 이미지의 다이어그램은 웹 기반 자바 시스템의 전형적인 시나리오를 보여준다.
> 
> ![diagram-of-web-based-java-system](https://jonghoonpark.com/assets/images/2023-10-24-클린-아키텍처/diagram-of-web-based-java-system.png)
> 
> 1. 웹 서버는 사용자로부터 입력 데이터를 모아서 좌측 상단의 Controller로 전달한다.
> 2. Controller는 데이터를 평범한 자바 객체(POJO)로 묶은 후, InputBoundary 인터페이스를 통해 UseCaseInteractor로 전달한다. UseCaseInteractor는 이 데이터를 해석해서 Entities가 어떻게 동작할지를 제어하는데 사용한다.
> 3. UseCaseInteractor는 DataAccessInterface를 사용하여 Entities가 사용할 데이터를 데이터베이스에서 불러와서 메모리로 로드한다.
> 4. Entities가 완성되면, UseCaseInteractor는 Entities로 부터 데이터를 모아서 또 다른 평범한 자바 객체인 OutputData 를 구성한다.
> 5. 그리고 나서 OutputData는 OutputBoundary 인터페이스를 통해 Presenter로 전달된다.

email 주소를 통해서 DB에서 일치하는 User를 조회해오고, OutputData로 변환하여 User의 name 정보만 가져오는 예시입니다.
(예제이며 실제 데이터베이스를 사용하지는 않았습니다.)

# 참고
- [클린 아키텍처에 대하여](https://jonghoonpark.com/2023/10/24/클린-아키텍처)
- [클린 아키텍처 설명 따라 직접 구현해보기](https://jonghoonpark.com/2023/10/25/클린-아키텍처-직접-구현해보기)
