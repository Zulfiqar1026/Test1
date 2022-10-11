Feature: Verify CATEGORIES Functionality



@Test
Scenario: verify Laptops page Display
Given launch "<URL>" urlsum

Then Click LaptopsLink
Then verify LaptopsDisplay