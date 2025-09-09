# Assignments and related works  

## Useful/cool links: 
- [common design patterns](https://www.digitalocean.com/community/tutorials/java-design-patterns-example-tutorial)
- [bytecode ixns](https://en.wikipedia.org/wiki/List_of_Java_bytecode_instructions) 
- [waste management!](https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html)
- [java card](https://en.wikipedia.org/wiki/Java_Card)  
- [compiler directives](https://docs.oracle.com/en/java/javase/24/vm/writing-directives.html#GUID-8ABE81D8-FABA-4871-86AA-998112994C44)
## notes on intelliJ 
- /out dir is intelliJ's "build folder" (ide specific)
  - temporary
  - contains compiled bytecode & build artifacts 
  - keeps project organized & clean 
  - when running programs, JVM executes __.class__ files from __/out__ instead of source __.java__ files 
  - intelliJ only recompiles changed files, storing results in __/out__ for faster builds
### intelliJ live templates  
- ```public static void main(String[] args) entrypoint```
  - main + tab
- ```System.out.println();```
  - sout + tab
- ```System.out.printf();``` 
  - soutf + tab 
- ```public static final```
  - psf + tab  
