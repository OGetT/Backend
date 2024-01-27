import React, { useState } from 'react';
import Header from '../components/header';
import { Link } from 'react-router-dom';

export default function Find() { // 아이디 | 비밀번호 찾기 페이지
  const [hasFind, setHasFind] = useState(false);
  return (
    <div className='flex justify-center items-center flex-col'>
      <Header />
      <div className="mt-14" style={{ width: '80%', borderBottom: '2px solid #d9ce94' }}> </div>
      {hasFind ? (
        <div className="flex justify-center flex-col items-center w-2/4">
          <div className="container mx-auto mt-28 mb-28 p-5 border border-mustardGray rounded shadow-lg bg-white">
            <h1 className="text-2xl font-bold mb-5">아이디 찾기</h1>
            <form id="product-form" className="space-y-4 flex flex-col w-4/5 mx-auto mt-8 mb-10">
              <div>
                <label htmlFor="product-name" className="block mb-2 text-sm font-bold text-gray-700">이름 :</label>
                <input type="text" id="product-name" name="name" className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-mustardYellow focus:border-mustardYellow block w-full p-2.5" />
              </div>
              <div>
                <label htmlFor="product-name" className="block mb-2 text-sm font-bold text-gray-700">이메일 :</label>
                <div className='flex'>
                  <input type="text" id="product-name" name="name" className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-mustardYellow focus:border-mustardYellow block w-full p-2.5" />
                  <button type="submit" className="text-white bg-TGreen hover:bg-mustardYellow focus:ring-4 focus:outline-none focus:ring-mustardYellow rounded-lg w-full sm:w-auto px-5 py-2.5 text-center font-bold text-sm whitespace-nowrap ml-3" style={{ color: 'white' }}>인증번호 받기</button>
                </div>
              </div>
              <div>
                <label htmlFor="product-name" className="block mb-2 text-sm font-bold text-gray-700">인증번호 :</label>
                <input type="text" id="product-name" name="name" className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-mustardYellow focus:border-mustardYellow block w-full p-2.5 mb-10" />
              </div>
              <Link to='/Login' className='flex flex-col'>
                <button type="submit" className="text-white bg-TGreen hover:bg-mustardYellow focus:ring-4 focus:outline-none focus:ring-mustardYellow rounded-lg sm:w-auto px-5 py-2.5 text-center font-bold w-full" style={{ color: 'white' }}>로그인</button>
              </Link>
            </form>
          </div >
        </div>
      ) : (
        <>
          <div className="flex justify-center flex-col items-center w-2/4">
            <div className="container mx-auto mt-28 mb-28 p-5 border border-mustardGray rounded shadow-lg bg-white">
              <h1 className="text-2xl font-bold mb-5">비밀번호 찾기</h1>
              <form id="product-form" className="space-y-4 flex flex-col w-4/5 mx-auto mt-8 mb-10">
                <div>
                  <label htmlFor="product-name" className="block mb-2 text-sm font-bold text-gray-700">이름 :</label>
                  <input type="text" id="product-name" name="name" className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-mustardYellow focus:border-mustardYellow block w-full p-2.5" />
                </div>
                <div>
                  <label htmlFor="product-name" className="block mb-2 text-sm font-bold text-gray-700">이메일 :</label>
                  <div className='flex'>
                    <input type="text" id="product-name" name="name" className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-mustardYellow focus:border-mustardYellow block w-full p-2.5" />
                    <button type="submit" className="text-white bg-TGreen hover:bg-mustardYellow focus:ring-4 focus:outline-none focus:ring-mustardYellow rounded-lg w-full sm:w-auto px-5 py-2.5 text-center font-bold text-sm whitespace-nowrap ml-3" style={{ color: 'white' }}>인증번호 받기</button>
                  </div>
                </div>
                <div>
                  <label htmlFor="product-name" className="block mb-2 text-sm font-bold text-gray-700">인증번호 :</label>
                  <input type="text" id="product-name" name="name" className="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-mustardYellow focus:border-mustardYellow block w-full p-2.5 mb-10" />
                </div>
                <Link to='/Login' className='flex flex-col'>
                  <button type="submit" className="text-white bg-TGreen hover:bg-mustardYellow focus:ring-4 focus:outline-none focus:ring-mustardYellow rounded-lg sm:w-auto px-5 py-2.5 text-center font-bold w-full" style={{ color: 'white' }}>로그인</button>
                </Link>
              </form>
            </div >
          </div>
        </>
      )}
    </div >
  );
}