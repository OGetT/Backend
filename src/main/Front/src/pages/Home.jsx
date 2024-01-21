import React from "react";

import Header from "../components/header";
import Card from "../components/card";
import PIcon from "../components/productIcon";

export default function Home() {
  return (
    <div className="w-screen h-screen flex flex-col justify-center items-center">
      <Header />

      <Card />

      <PIcon />
    </div>
  );
}
