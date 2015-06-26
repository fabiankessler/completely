# Description

*Completely* is a Java autocomplete library.

Autocomplete involves predicting a word or phrase that the user may type based on a partial query. The goal is to provide instant feeback and avoid unecessary typing as the user formulates queries. Performance is a key issue since each keystroke from the user could invoke a query, and each query should be answered within few milliseconds. *Completely* relies on text preprocessing to create an in-memory index data structure for efficiently answering searches.

# Build from source

Building *Completely* requires Maven 3 and Java 8, or newer.

Download the source code:

    git clone https://github.com/fmmfonseca/completely.git

Build the JAR package:

    mvn clean package -DskipTests

# Run the sample

Install artifacts to the local repository:

    mvn install

Execute the main class:

    mvn exec:java -pl sample

# References

* Bořivoj Melichar. Approximate String Matching by Finite Automata;
* Gonzalo Navarro. A Guided Tour to Approximate String Matching;
* Leonid Boytsov. Indexing Methods for Approximate Dictionary Searching: Comparative Analysis;
* Marios Hadjieleftheriou and Divesh Srivastava. Approximate String Processing;
* Surajit Chaudhuri and Raghav Kaushik. Extending Autocompletion To Tolerate Errors;

# License

Released under The Apache Software License, Version 2.0
