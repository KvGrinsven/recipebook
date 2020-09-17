import React, { useState, useEffect } from "react";
import { RecipeList } from "./RecipeList";
import { Recipe } from "./Recipe";

export function App() {

    const [ recipes, setRecipes ] = useState(undefined);
    const [ errorMessage, setErrorMessage ] = useState("");

    async function getRecipes() {
        try {
          const response = await fetch('grublub/webapi/init', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
          });

          if (response.ok) {
            const recipes = await response.json();
            setRecipes(recipes);
          }
        } catch (error) {
            setErrorMessage(error.toString());
        }
    }

    useEffect(() => {
       getRecipes();
    }, []);


    if(recipes) {
      return <div>
        <RecipeList recipes={recipes}/>
        <Recipe recipe={recipes[0]}/>
      </div>
    } else {
      return <div><h1>No recipes!</h1></div>
    }
}
