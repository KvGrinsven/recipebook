import * as React from "react";
import { RecipeList } from "./RecipeList";
import { Recipe } from "./Recipe";

export class App extends React.Component<any, any> {
  constructor(props: {}) {
    super(props);

    this.state = {
      recipes: [],
    }
  }

  componentDidMount() {
    fetch('grublub/webapi/init')
      .then(response => response.json())
      .then(recipes => this.setState({ recipes }));
  }

  public render(): JSX.Element {
    console.log(this.state.recipes[0]);


    return <div>
      <RecipeList recipes={this.state.recipes}/>
      <Recipe recipe={this.state.recipes[0]}/>
    </div>
  }
}
