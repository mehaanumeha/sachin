Feature:  Validate the authentic user


Background: 
  Given landing page is open 

  Scenario: User is valid
    
    When  enter username is "standard_user" in usernamefield
    And  enter password is "secret_sauce" in passwordfield
    And  click on button
    Then  home page will appear
        
    Scenario: Inavalid User Valid Password
    When  enter username is "standard" in usernamefield
    And  enter password is "secret_sauce" in passwordfield
    And  click on button
    Then  User    should Stay on login Page
           
  
    Scenario: Inavalid User InValid Password
    When  enter username is "standard" in usernamefield
    And  enter password is "secret" in passwordfield
    And  click on button
   Then  User should Stay on login Page