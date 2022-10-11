Feature: This feature is to validate items add to cart functionality successfully


@Test
Scenario: Need verification of user login successfully
Given launch "<URL>" urlsum 

Then click Monitor
Then click AppleMonitor24
Then click Add to Cart alert
Then click Cart to check
Then verify Order Placed
