// use an integer for version numbers
version = 2


cloudstream {
    // All of these properties are optional, you can safely remove them

     description = "Also includes Dopebox, Solarmovie, Zoro and 2embed"
    // authors = listOf("Cloudburst")

    /**
    * Status int as the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta only
    * */
    status = 1 // will be 3 if unspecified

    // Set to true to get an 18+ symbol next to the plugin
    adult = false // will be false if unspecified
}