# String Lab 1

## Learning Goals

- Write a loop to access each character in a string
- Determine the presence of specific characters in a string
- Test for characters that fall within a range of ASCII decimal values

## Introduction

You will implement a simple password checker that measures
the strength of a string based on how many of the following rules are met:

1. The string length is at least 8.
2. The string contains at least one special character '!' or '#' or '?'.
3. The string contains at least one digit.
4. The string contains at least one non-digit.


## Instructions

The starter project has a class `PasswordChecker` with several stub methods that return
a default value.  You will adapt the methods to implement the password checker based on the
rules above.   You are also provided a Junit test class `PasswordCheckerTest`, which
has the test methods disabled.  As you solve each task, remove the `@Disabled` annotation
to run the test method and confirm your implementation.

Do not use regular expressions to solve any of the tasks. We'll cover regular expressions in a later unit.

You may use the methods of the [Java 17 String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html) class.

You may adapt the example string utility methods from the lessons.

Do not import string utility classes from external packages.

## Task #1

1. The `PasswordChecker` class contains an `isValidLength` method that returns `false`.  
   Edit the method to return a boolean indicating if the parameter string length is at least 8.
2. Edit `PasswordCheckerTest` to remove the `@Disabled` annotation from the `isValidLength` method.
3. Run `PasswordCheckerTest` and confirm the test passes.

## Task #2

1. The `PasswordChecker` class contains a `containsSpecialChar` method that returns `false`.   
   Edit the method to return a boolean indicating if the parameter string contains at least one
   of the special characters '!' or '#' or '?'.
2. Edit `PasswordCheckerTest` to remove the `@Disabled` annotation from the `containsSpecialChar` method.
3. Run `PasswordCheckerTest` and confirm the test passes.

## Task #3

1. The `PasswordChecker` class contains a `containsDigit` method that returns `false`.   
   Edit the method to return a boolean indicating if the parameter string contains at least one digit
   (HINT: test for characters within a range).
2. Edit `PasswordCheckerTest` to remove the `@Disabled` annotation from the `containsDigit` method.
3. Run `PasswordCheckerTest` and confirm the test passes.

## Task #4

1. The `PasswordChecker` class contains a `containsNonDigit` method that returns `false`.   
   Edit the method to return a boolean indicating if the parameter string contains at least
   character that is **not** a digit (HINT: test for characters outside a range).
2. Edit `PasswordCheckerTest` to remove the `@Disabled` annotation from the `containsNonDigit` method.
3. Run `PasswordCheckerTest` and confirm the test passes.

## Task #5

1. The `PasswordChecker` class contains a `passwordStrength` method that returns `0`.   
   Edit the method to return the strength of the parameter string based on how many
   of the methods `isValidLength`, `containsSpecialChar`, `containsDigit`, and `containsNonDigit`
   return a positive boolean value. The `passwordStrength` method should give 1 point for each method that returns `true`.
   - If all four of the methods from the previous tasks return `true`, then the password strength should be 4.
   - If only three methods return `true`, the password strength should be 3.
   - Etc.
2. Edit `PasswordCheckerTest` to remove the `@Disabled` annotation from the `passwordStrength` method.
3. Run `PasswordCheckerTest` and confirm the tests all pass.


## Resources

- [Java 17 String](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)

