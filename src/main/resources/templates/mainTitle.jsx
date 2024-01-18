import { Link, useNavigate } from "react-router-dom";
import React from "react";

const MainTitle = () => {
  const navigate = useNavigate();
  return (
    <p className="flex justify-center pb-12 w-full pt-12" href="index.html" onClick={() => {
      navigate("/");
    }}>
      <Link to="/">
        <span style={{ fontFamily: 'dattebayo' }} className="text-[80px] font-bold text-green-900 m-0 text-TGreen">
          GreenShop
        </span>
      </Link>
    </p>
  );
}

export default MainTitle;