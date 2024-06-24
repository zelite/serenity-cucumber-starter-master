# Try to reproduce bug

Using the serenity-cucumber-start-master to attempt to reproduce a bug.

## Steps to reproduce

Run

```shell
mvn clean verify
```

## Observed behavior

The serenity reports say that there is a total of 16 test cases executed:

```shell
[INFO] Results:
[INFO]
[ERROR] Failures: 
[ERROR]   1 expectation failed.
Expected status code <500> but was <200>.

[ERROR]   1 expectation failed.
Expected status code <500> but was <200>.

[INFO]
[ERROR] Tests run: 2, Failures: 2, Errors: 0, Skipped: 0
[INFO]
[INFO] 
[INFO] --- serenity:4.1.20:aggregate (serenity-reports) @ cucumber-starter ---
[INFO] GENERATING REPORTS FOR: C:\repos\serenity-cucumber-starter-master
[INFO] GENERATING REPORTS USING 40 THREADS
[INFO] GENERATING SUMMARY REPORTS...
[INFO] GENERATING REQUIREMENTS REPORTS...
[INFO] GENERATING RESULT REPORTS...
[INFO] GENERATING ERROR REPORTS...
[INFO] Test results for 16 tests generated in 3.8 secs in directory: file:/C:/repos/serenity-cucumber-starter-master/target/site/serenity/
[INFO] ------------------------------------------------
[INFO] | SERENITY TESTS:               | FAILURE
[INFO] ------------------------------------------------
[INFO] | Test scenarios executed       | 1
[INFO] | Total Test cases executed     | 16
[INFO] | Tests passed                  | 0
[INFO] | Tests failed                  | 2
[INFO] | Tests with errors             | 0
[INFO] | Tests compromised             | 0
[INFO] | Tests aborted                 | 0
[INFO] | Tests pending                 | 0
[INFO] | Tests ignored/skipped         | 0
[INFO] ------------------------------- | --------------
[INFO] | Total Duration| 4s 160ms
[INFO] | Fastest test took| 000ms
[INFO] | Slowest test took| 4s 151ms
[INFO] ------------------------------------------------
[INFO]

```

## Expected behavior

The "Total Test cases executed" should be 2, not 16.

 