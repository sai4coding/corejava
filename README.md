Exception: An exception is an abnormal event that occurs during program execution and disrupts the normal flow of instructions at runtime. Some exceptions are detected by the Java compiler at compile time and are called checked exceptions. Other exceptions occur at runtime and are detected by the JVM; these are called unchecked exceptions. Both types of exceptions can be handled using Java’s exception handling mechanism to maintain the normal flow of execution.

IOException : it is a checked exception occurs because of failure in input / output 
eg: when filewriter intracts with file system in out computer file operations depend on:

Disk state,Folder permissions,File locks,OS constraints so java warns with IOException which is handled with try - catch or throws(because it is a checked exception) check program 3 

Try with resources : 
To ensure that resources (like files, streams, scanners, sockets, DB connections) are automatically closed after use — even if an exception occurs.

This prevents:
Resource leaks,File locks,Memory leaks,OS descriptor exhaustion
Syntax : try (Resource1; Resource2; Resource3) {
    // use resources
}

