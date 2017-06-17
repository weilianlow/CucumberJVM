Feature: Doc String and Datatable Test
  I want to use this template for my feature file
	@active
  Scenario Outline: Steps with Doc String and Datatable
    When User enter his credentials via login
      | username   | password   | domain   |
      | <username> | <password> | <domain> |
    Then he will be welcomed with a greetings message
      """
      	Welcome <username> to the main page of <domain>.
      	For assistance, please click on the help button found on the right pane of this page.
      """

    Examples: 
      | username | password | domain             |
      | peter    | pwd1     | investment banking |
      | mary     | pwd2     | consumer banking   |
