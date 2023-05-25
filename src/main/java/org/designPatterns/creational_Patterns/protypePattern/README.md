# The concepts when choosing a prototype are:

1. [ ] when you are trying to avoid costly creation (If an object is expensive to create).
2. [ ] when you are trying to avoid subclassing. Usually you create an instance of the actual prototype that you are trying to work with.
3. [ ] typically yoy don't use the keyword new. The first instance created might use the keyword new, but after that they are cloned.
4. [ ] Prototypes are also usually implemented with some sort of registry (cache). The original object is created and then kept in our registry.

Example of the prototype pattern from the Java API is: **_java.lang.Object clone_** method.

The clone method and essentially just making a copy, each instance is still unique.
Different from patterns like builder, costly construction is not handled by the client.
The builder is the opposite of the prototype.

