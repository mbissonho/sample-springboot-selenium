Feature: Login
	Scenario: Usuario Logado
		Given Estou na página de login "http://localhost:8080/webapp"
		When Preencher no campo usuario o valor "login@mail.com"
			And Preencher no campo senha o valor "pass"
			And Pressionar o botão "btnLogin"
		Then Deveremos estar na página "http://localhost:8080/webapp/home"