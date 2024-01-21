import React from "react";
import { useNavigate } from "react-router-dom";
import PurchaseIcon from "../svg/Purchase.svg";
import RegisterIcon from "../svg/register.svg";

const registaration = () => {
  return (
    <footer style="display: flex; justify-content: flex-end;">
      <div class="btn-purchase" style="margin-right: 10px;">
        <a href="Purchase.html">
          <img src={PurchaseIcon} alt="purchase" width="50" height="50" />
        </a>
      </div>
      <div class="btn-product_registration">
        <a href="product_registration.html">
          <img src={RegisterIcon} alt="register" width="50" height="50" />
        </a>
      </div>
    </footer>
  );
}