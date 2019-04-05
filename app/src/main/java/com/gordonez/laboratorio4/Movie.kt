package com.gordonez.laboratorio4

import android.os.Parcel
import android.os.Parcelable


data class Movie  (

    val Title:String = "N/A",
    val Year:String = "N/A",
    val Released:String = "N/A",
    val RunTime:String = "N/A",
    val Genre:String = "N/A",
    val Director:String = "N/A",
    val Actors: String = "N/A",
    val Plot:String = "N/A",
    val Language:String = "N/A",
    val imbdRating:String = "N/A",
    val Poster:String = "N/A"
    ) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Title)
        parcel.writeString(Year)
        parcel.writeString(Released)
        parcel.writeString(RunTime)
        parcel.writeString(Genre)
        parcel.writeString(Director)
        parcel.writeString(Actors)
        parcel.writeString(Plot)
        parcel.writeString(Language)
        parcel.writeString(imbdRating)
        parcel.writeString(Poster)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}