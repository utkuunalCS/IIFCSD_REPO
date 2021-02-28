import React from "react";
import axios from 'axios';
import react, { useState, useEffect } from 'react';
import ProductTable from "../components/ProductTable";

const ProductPanel = () => {

    const [posts, setPosts] = useState(Array(100));
    const [isDataReload, setDataState] = useState(false);

    const getPostsFromServer = async() => {
        axios.get('http://localhost:8080/product/getAllProducts')
            .then(response => {
                if(response.status == 200)
                {
                    setPosts(response.data);
                    setDataState(true);
                }
                console.log(posts);
            })
            .catch(error => {
                console.log(error);
            });
    }

    useEffect(() => {
        if(!isDataReload)
        {
            getPostsFromServer();
        }    
      });

    return (<ProductTable products={posts} ></ProductTable>);
  
}

export default ProductPanel;
