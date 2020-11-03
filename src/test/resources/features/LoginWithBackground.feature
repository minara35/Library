@loginWithBackground
Feature: Login feature
  CBT -25: As a user, I should be able to login with correct credentials
  to different accounts. And dashboard should be displayed
  #this is how you comment in feature file

  #BEFORE ANNOTATION

  Background:Backstory is that user is in the login page
  Given User is on login page


  Scenario: Librarian login scenario
    When User logs in as librarian
    Then User should see dashboard
    #AFTER ANNOTATION


  Scenario: Student login scenario
    When User logs in as student
    Then User should see dashboard
     #AFTER ANNOTATION

@db
  Scenario: Admin login scenario
  #BEFORESTEPS RUNS HERE
    When User logs in as admin
  #AFTERSTEPS RUNS HERE
   #BEFORESTEPS RUNS HERE

    Then User should see dashboard
   #AFTER ANNOTATION
  #AFTER ANNOTATION RUNS HERE


