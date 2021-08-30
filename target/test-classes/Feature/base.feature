Feature: verifying the Details

  Scenario Outline: Verifying Adactin login with value with valid credentials
    Given user is on the Adactin page
    When user should enter "<UserName>","<Password>"
    And user should Click Login
    And user should select "<Location>","<Hotel>","<RoomType>","<NoOfRoom>","<ChkIn>","<ChkOut>","<Adltroom>","<Childroom>"
    And user should slect btn
    And user should seclt "<FirstName>","<LastName>","<Address>","<CardNo>","<CardType>","<ExpryMnt>","<ExpyYr>","<CardCvv>",
    Then user can get order Id

    Examples: 
      | UserName  | Password | Location | Hotel       | RoomType | NoOfRoom | ChkIn      | ChkOut     | Adltroom | Childroom | FirstName | LastName | Address     | CardNo            | CardType | ExpryMnt  | ExpyYr | CardCvv |
      | Mayilsamy | U65Z7D   | Sydney   | Hotel Creek | Standard | 1 - One  | 20/08/2021 | 29/08/2021 | 1 - One  | 0 - None  | Boss      | S        | Omr Chennai | 15987532156487895 | VISA     | September |   2022 |     452 |
