Feature: Application Login

@SmokeTest
Scenario: Home page default login
Given User is on NetBanking Landing page
When User login into application with "jin" and password "1234"
Then home page is populated
And Cards are displayed "true"

