Feature: login

  @Test
    Scenario: login Scenario
    When User opens the url enter the valid details & click on login button

  @Test1
    Scenario:  Blank login Scenario
    When User opens the url put the field blank & click on login button


#  @Test2
#    Scenario: Invalid login Scenario
#    Given user opens the url
#    When user Enters invalid user id password
#    Then User is not navigated to the next page

  @Test3
  Scenario Outline: Invalid1 login Scenario
    Given  user opens the url
    When  user Enter <userId> and <password>
    Then User is not navigated to the next page
    Examples:-
    |userId  |                     |password|
    |pradnya.ash@coditas.com|      |Pradnya@12|
    |pradnya.ashte@coditas.com|    |Pradnya78|
    |Pradnya.Ashte+PM@coditas.com| |Pradnya@1|
  @Test4
  Scenario: Forgotpassword
    Given  user is on the login page
    When  user clicks the "Forgot Password" link
    Then User should be redirected to the password reset page
    Then user enters their email address and click on reset link
  @Test5
  Scenario: Edit Reportees with fname,lname,update button(Accepted status)
    When User opens the url enter the valid details & click on login button
    Then user clicks on Reportees tab
    And User clicks on edit button of email "aditi.mahiman+PE1@coditas.com"
    Then user clicks on  fname edit reportees
    Then user edits laname
    Then user clicks on update button

@Test6
  Scenario: Edit Reportees with email id (status invited,expiry)
    When User opens the url enter the valid details & click on login button
    Then user clicks on Reportees tab
    And User clicks on edit button of email "pradnya.ashte+pe2@coditas.com"
    Then user clicks on  fname edit reportees
    Then user edits laname
    Then user edits email id
    Then user clicks on update button

  @Test7
  Scenario: Edit Reportees2
    Given user opens the url
    When enter the valid details & click on login button
    Then user clicks on Reportees tab1
    And User clicks on edit button of email "Aditi.mahiman+PM@coditas.com"
    Then user clicks on edit reportees user edit fname and enter invalid deatils
    Then user edits lname and enter invalid details
    Then user clicks on cancel button

  @Test8
  Scenario: edit reportees3
    When user opens the url enter valid details and click on login button
    Then user clicks on Reportees tab2
    And User clicks on edit button of email "Aditi.mahiman+PM@coditas.com"
    Then user clicks on  fname edit reportees1
    Then user edits laname1
    Then user clicks on drodown
    When select Option 2 from the dropdown
    Then The selected option should be Option 2
    Then user clicks on update button
    @Test9
  Scenario: edit reportees4
    When user opens the url enter valid details and click on login button
    Then user clicks on Reportees tab2
    And User clicks on dropdownedit button
    Then user clicks on  fname edit reportees1
    Then user edits laname1
    Then user clicks on drodown
    When select required option
      Then user clicks on update button
      @Test10
      Scenario: View button
      When User opens the url enter the valid details & click on login button
      Then user clicks on Reportees tab
      And User clicks on view button of email "Aditi.mahiman+PM@coditas.com"
      Then verify the text on view window
  @Test11
     Scenario: View button Principal
     When User opens the url enter the valid details & click on login button
     Then user clicks on Reportees tab
     And User clicks on view button of email "shradha.khaire+PM@coditas.com"
     Then verify the text on view window of Pricipal
  @Test12
  Scenario: sorting email
    When User opens the url enter the valid details & click on login button
    Then user clicks on Reportees tab
    Then user clicks on Email arrow
@Test13
  Scenario: Edit Project
    When User opens the url enter the valid details & click on login button
    Then user clicks edits button of "ONEVIEW" project
    Then user edits project name
    Then user clicks on drop down and select the option 2 from drop down
    Then user edits planviewid
    Then user edits Project Budget
    Then user clicks on save button
  @Test14
  Scenario: Edit phase
  When User opens the url enter the valid details & click on login button
  Then user clicks on "video" project accrodation
  Then User clicks on edit button of project phase
 Then user clicks on drop down and select option 2 from drop down of edit project phase
Then user edit the Strech field
Then user edits target field
 Then user edits Threshold field
 Then user clicks on save button of edit project phase
@Test15
  Scenario: Invalid Edit project phase
    When User opens the url enter the valid details & click on login button
    Then user clicks on accrodation
    Then User clicks on edit button of project phase
    Then user clicks on drop down and select option 2 from drop down of edit project phase
    Then user edit the Strech field and enter the invalid deatils
    Then user edits target field
    Then user edits Threshold field

  @Test16
  Scenario:view phase
    When User opens the url enter the valid details & click on login button
    Then user clicks on "Ambry" project accrodation
    Then user clicks on view button of project phase
    Then user clicks on Actuals tab
    And clicks on upload button
    And clicks on upload icon
    Then clicks in Done button
    Then User is able to see the toster message on top
    @Test17
  Scenario:view phase invalid file upload
    When User opens the url enter the valid details & click on login button
    Then user clicks on "Ambry" project accrodation
    Then user clicks on view button of project phase
    Then user clicks on Actuals tab
    And clicks on upload button
    And clicks on uploadinvalid  icon
@Test18
  Scenario:view phase filter
    When User opens the url enter the valid details & click on login button
    Then user clicks on "BHP" project accrodation
#    Then user clicks on accrodation
    Then user clicks on view button of project phase
    Then user clicks on Actuals tab
    And user clicks on filter section
    And user clicks "not empty" filteroption
#  And user enters the text into text filed
@Test19
  Scenario:Logout
    When User opens the url enter the valid details & click on login button
    Then user clicks on profile icon
    Then user clicks on Logout arrow






















