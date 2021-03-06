package com.lunatech.swagmyfinchup.programmers.views

import io.finch.{Endpoint, _}

object Routes {

  val programmers: Endpoint0 = "programmers"

  val uid: Endpoint[Option[String]] = paramOption("userId")
  val q: Endpoint[Option[String]]   = paramOption("searchString")
  val skip: Endpoint[Int]           = paramOption("skip").as[Int].withDefault(0)
  val limit: Endpoint[Int]          = paramOption("limit").as[Int].withDefault(100)

}
