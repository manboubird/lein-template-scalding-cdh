# {{ns-name}}

Project description

## Usage

local-mode
```bash
lein run {{sanitized}}.ReadWriteFile --local --input data/input.txt --output output.tsv
 or
lein run -m com.twitter.scalding.Tool {{sanitized}}.ReadWriteFile --local --input data/input.txt --output output.tsv
```

On hadoop
```bash
lein uberjar
hadoop jar target/{{ns-name}}-0.1.0-standalone.jar {{sanitized}}.ReadWriteFile --hdfs --input input.txt --output output.tsv
```

## License

Copyright (C) 2011 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
