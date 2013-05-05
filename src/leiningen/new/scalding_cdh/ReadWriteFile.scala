package {{sanitized}} 

import com.twitter.scalding._

class ReadWriteFile(args : Args) extends Job(args) {
    TextLine(args("input"))
      .write(Tsv(args("output")))
}
