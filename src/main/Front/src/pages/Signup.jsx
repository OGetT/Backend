import React, { useState } from "react";
import Header from "../components/header";
import "../css/bootstrap.css";
import "../css/st.css";
import "../css/style.css";

export default function Signup() {
    const [hasSignup, setHasSignup] = useState(false);
    return (
        <div className=" w-screen h-screen flex flex-col justify-center items-center">
            <Header />
            {hasSignup ? (
                <div className="MCompletion">
                    <div className="separator"></div>
                    <li
                        className="MC"
                        onclick="window.location.href='Wishlist.html'"
                        style="margin-left:23px;"
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
                    <strong>회원가입 완료</strong>
                </div>
            ) : (
                <>
                    <div className="Mem">
                        <h2>회원가입</h2>
                        <div className="MemSet">
                            <label for="username">ID 입력 </label>
                            <input type="tel" id="username" name="username" />
                            <button type="button" id="checkUsername">
                                {" "}
                                중복 확인{" "}
                            </button>
                            <div className="SS"></div>
                            <label for="password">비밀번호 입력</label>
                            <input type="password" id="password" name="password" />
                            <div className="MS"></div>
                            <label for="password">비밀번호 확인 </label>
                            <input type="password" id="passwordE" name="passwordE" />
                            <div className="SS"></div>
                            <label for="text">이메일 </label>
                            <input type="text" id="email" name="email" />
                            <div className="MS"></div>
                            <label for="text">이메일 확인 </label>
                            <input type="text" id="emailE" name="email" />
                            <div className="SS"></div>
                            <label for="text">이름 </label>
                            <input type="text" id="name" name="name" />
                            <div className="MS"></div>
                            <label for="text">생년월일 ( 6자리 ) </label>
                            <input type="textd" id="birthdate" name="birthdate" maxLength={6} />

                            <div className="SS"></div>
                            <label for="text">성별 선택</label>
                            <form>
                                <label>
                                    <input type="radio" name="gender" value="MALE" />
                                    남자
                                </label>

                                <label>
                                    <input type="radio" name="gender" value="FEMALE" />
                                    여자
                                </label>
                            </form>

                            <div className="SS"></div>
                            <label for="text">전화번호</label>
                            <input type="text" id="phoneNum" name="phoneNum" />
                            <div className="MS"></div>
                            <label for="text">전화번호 확인 </label>
                            <input type="text" id="phoneNumE" name="phoneNumE" />
                        </div>
                    </div>
                    <div className="SS"></div>
                    <div className="BtnI">
                        <button type="button" id="cancelButton">
                            취소
                        </button>
                        <button type="submit" id="submitButton">
                            회원가입
                        </button>
                    </div>
                    <div className="SS"></div>
                </>
            )}
        </div>
    );
}