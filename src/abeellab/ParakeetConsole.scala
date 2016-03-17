package abeellab

import abeellab.parakeet.ParakeetTyper

object ParakeetConsole {

  def main(args: Array[String]) = {

    if (args.size == 0) listInstructions
    else {
      args(0) match {

        case "help" => listInstructions
       
        case "is6110-typer" => ParakeetTyper.main(args.drop(1))
        case _ => listInstructions
      }
    }

    def listInstructions() {
      println("Usage: java -jar parakeet.jar [instruction] [instruction options...]")
      println("Instructions:")
      println("\tis6110-typer    Identify insertion flanks of IS6110")
      
    }

  }

}