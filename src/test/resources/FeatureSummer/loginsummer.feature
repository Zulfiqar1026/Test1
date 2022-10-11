Feature: This feature is to validate login functionality in project summer



@Test
Scenario: Need verification of user login successfully
Given launch "<URLSUM>" urlsum 
Then click loginsum
Then enter namesum and passwordsum and click submit button
Then user loginsum has been successful 