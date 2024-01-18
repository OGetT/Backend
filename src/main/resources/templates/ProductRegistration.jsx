import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import Header from "../components/header";

export default function ProductRegistration() {
  const [productID, setProductID] = useState('');
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    navigate(`/Purchase?product=${productID}`);
  };

  return (
    <div>
      <Header />
      <div>
        <h1>상품 등록</h1>
        <form id="product-form" onSubmit={handleSubmit}>
          <label htmlFor="product-image">사진:</label>
          <input type="file" id="product-image" name="image" />

          <label htmlFor="product-name">이름:</label>
          <input type="text" id="product-name" name="name" />

          <label htmlFor="product-price">가격:</label>
          <input type="number" id="product-price" name="price" />

          <label htmlFor="product-category">옷 종류:</label>
          <input type="text" id="product-category" name="category" />

          <button type="submit">등록</button>
        </form>
      </div>
    </div>
  );
}