import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import Purchase from "../assets/icon/purchase.svg";
import { Link } from "react-router-dom";
import '../css/productIcon.css';

const ProductIcon = () => {
  const navigate = useNavigate();
  const [isFixed, setIsFixed] = useState(false);

  const handlePurchaseClick = () => {
    navigate("/product-registration");
  };

  useEffect(() => {
    const handleScroll = () => {
      const offset = window.scrollY;
      // 원하는 위치 (예: 100px)에 도달하면 고정
      setIsFixed(offset >= window.innerHeight - 100);
    };

    // 스크롤 이벤트 리스너 등록
    window.addEventListener('scroll', handleScroll);

    // 컴포넌트 언마운트 시 이벤트 리스너 제거
    return () => {
      window.removeEventListener('scroll', handleScroll);
    };
  }, []);

  return (
    <footer className="picon-container">
      <div className={`picon ${isFixed ? 'fixed-style' : ''}`}>
        <Link to='/product-registration'>
          <li onClick={handlePurchaseClick} style={{ marginLeft: '23px', color: 'your-desired-color' }}>
            <img className="w-12 h-12 ml-3" src={Purchase} alt="purchase" />
            <strong className="your-tailwind-styles">상품 등록</strong>
          </li>
        </Link>
      </div>
    </footer>

  );
}

export default ProductIcon;