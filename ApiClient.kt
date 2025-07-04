object ApiClient {
  private const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
  val instance: WeatherService by lazy {
    Retrofit.Builder()
      .baseUrl(BASE_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build()
      .create(WeatherService::class.java)
  }
}
