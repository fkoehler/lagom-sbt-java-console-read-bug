object Main extends App {
  println("reading ....")
  //System.in.read()  <---- broken
  System.console().readLine()    // <--- working
  println("done!")
}