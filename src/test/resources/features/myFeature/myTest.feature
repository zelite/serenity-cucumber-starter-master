Feature: try to reproduce wrong report generation

  Background:
    Given do something

  Scenario Outline: do something with <something>
    # 1 2 2
      # When do something wronger
      #| arg1 | arg2 |
    # 1 2 2
      # When do something wrong
    # 1 4 2
    When do something wrong ensure
    | arg1 | arg2 |
    When do something
    Examples:
      | something |
      | "hello"   |
      | "world"   |

