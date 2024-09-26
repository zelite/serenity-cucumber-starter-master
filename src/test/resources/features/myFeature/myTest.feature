Feature: try to reproduce wrong report generation

  Background:
    Given do something

  Scenario Outline: do something with <something>
    When do something wronger
      | arg1 | arg2 |
    When do something
    Examples:
      | something |
      | "hello"   |
      | "world"   |

