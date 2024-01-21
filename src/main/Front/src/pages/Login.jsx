import React, { useState } from 'react';
import Header from '../components/header';
import '../css/bootstrap.css';
import '../css/st.css';
import '../css/style.css';

export default function Login() {
  const [hasLogin, setHasLogin] = useState(false);
  return (
    <div className=" w-screen h-screen flex flex-col justify-center items-center">
      <Header />
      {hasLogin ? (
        <div className="MCompletion">
          <div className="separator"></div>
          <li
            className="MC"
            onclick="window.location.href='Wishlist.html'"
            style={{ marginLeft: '23px' }}
          >
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="200"
              height="200"
              viewBox="0 0 24 24"
            >
              <g
                fill="none"
                stroke="#305440"
                stroke-linecap="round"
                stroke-linejoin="round"
                stroke-width="2.5"
              >
                <circle cx="12" cy="12" r="9"></circle>
                <path d="m15 10l-4 4l-2-2"></path>
              </g>
            </svg>
          </li>
          <strong>로그인 완료</strong>
        </div>
      ) : (
        <>
          <div className="Mem">
            <h2>로그인</h2>
            <div className="MemSet">
              <label for="username">ID </label>
              <input type="text" id="username" name="username" />
              <div className="MS"></div>
              <label for="password">PW </label>
              <input type="password" id="password" name="password" />
              <div className="MS"></div>
            </div>
            <input type="checkbox" id="myCheckbox" />
            <label for="myCheckbox">아이디 저장</label>
            <input type="checkbox" id="myCheckbox" />
            <label for="myCheckbox">자동로그인</label>
          </div>
          <div className="SS"></div>
          <div className="info">
            <a href="Membership.html">회원가입</a>
            <a href="FindID.html">아이디찾기</a>
            <a href="FindPassword.html">비밀번호찾기</a>
          </div>
          <div className="BtnI">
            <button type="button" id="cancelButton">
              로그인
            </button>
          </div>
          <div className="SS"></div>
        </>
      )}
    </div>
  );
}
