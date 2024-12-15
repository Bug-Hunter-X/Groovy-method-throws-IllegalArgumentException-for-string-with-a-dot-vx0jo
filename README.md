# Groovy Method Exception Handling Bug

This repository demonstrates a bug in a Groovy method that throws an `IllegalArgumentException` if the input string contains a dot (.). The method is designed to handle null and empty string inputs gracefully, but it fails to handle strings containing dots appropriately.  The solution demonstrates how to improve the error handling.

## Bug Description

The `myMethod` in `bug.groovy` throws an `IllegalArgumentException` when the input parameter contains a dot. While null and empty parameter checks are present, this specific edge case is not handled correctly. 

## Solution

The solution, implemented in `bugSolution.groovy`, addresses the issue by modifying the error handling mechanism. Rather than throwing an exception, the solution provides a more informative return value.