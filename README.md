A leiningen template for creating new scalding projects with cdh.

To install:

```bash
git clone https://github.com/manboubird/lein-template-scalding-cdh.git 
cd lein-template-scalding-cdh
lein install
```

To use:

```bash
lein new scalding-cdh my-scalding-project
cd my-scalding-project

# local mode
lein run cdh_s2.ReadWriteFile --local --input data/input.txt --output output.tsv

# on hadoop
lein uberjar
hadoop -put data/input.txt ./
hadoop jar ./target/my-scalding-project-0.1.0-standalone.jar my_scalding_project.ReadWriteFile --hdfs --input input.txt --output output.tsv
```

## Resources

Scalding build with Leiningen
https://github.com/masverba/scalding-on-leiningen

## License

Copyright (C) 2013

Distributed under the Eclipse Public License, the same as Clojure.

