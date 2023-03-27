Feature: Application Login

Background:
Given validate the browser
When Browser is Triggered
Then check if browser is started

@RegTest
Scenario: Home page default login
Given User is on NetBanking Landing page
When User login into application with "jin" and password "1234"
Then home page is populated
And Cards are displayed "true"

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking Landing page
When User login into application with "john" and password "4321"
Then home page is populated
And Cards are displayed "false"

@RegTest
Scenario: Home page default login
Given User is on NetBanking Landing page
When User sign up with following details
| Umer | abcd | John@gmail.com | America | 400102 | 
Then home page is populated
And Cards are displayed "false"

@SmokeTest
Scenario Outline: Home page default login
Given User is on NetBanking Landing page

When User login in to application with <Username> and password <password> 
Then home page is populated
And Cards are displayed "true"

Examples:
|Username |password|
|user1    |pass1   |
|user2    |pass2   |
|user3    |pass3   |