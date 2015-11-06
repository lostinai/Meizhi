/*
 * Copyright (C) 2015 Drakeet <drakeet.me@gmail.com>
 *
 * This file is part of Meizhi
 *
 * Meizhi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Meizhi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Meizhi.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.drakeet.meizhi;

import me.drakeet.meizhi.data.DGankData;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;
import rx.Observable;

// @formatter:off

/**
 * Created by drakeet on 8/9/15.
 */
public interface IDrakeet {

    @Headers({ "X-LC-Id: 0azfScvBLCC9tAGRAwIhcC40",
               "X-LC-Key: gAuE93qAusvP8gk1VW8DtOUb",
               "Content-Type: application/json" })
    @GET("/Gank?where=%7B%22tag%22%3A%22{year}-{month}-{day}%22%7D") Observable<DGankData> getDGankData(
            @Path("year") int year,
            @Path("month") int month,
            @Path("day") int day);
}
