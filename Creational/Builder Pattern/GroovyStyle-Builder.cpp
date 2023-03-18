#include <string>
#include <vector>
#include <iostream>
#include<string.h>
using namespace std;
namespace html {
  struct Tag
  {
    string name;
    string text;
    vector<Tag> children;
    vector<pair<string, string> > attributes;

    friend ostream& operator<<(ostream& os, const Tag& tag)
    {
      os << "<" << tag.name;

      for (pair<string,string> att : tag.attributes)
        os << " " << att.first << "=\"" << att.second << "\"";

      if (tag.children.size() == 0 && tag.text.length() == 0)
      {
        os << "/>" <<endl;
      } 
      else
      {
        os << ">" <<endl;

        if (tag.text.length())
          os << tag.text << endl;

        for (const auto& child : tag.children)
          os << child;

        os << "</" << tag.name << ">" << endl;
      }

      return os;
    }
  protected:

    Tag(const string& name, const string& text):name(name),text(text)
    {
    }


    Tag(const string& name, const vector<Tag>& children):name(name),children(children)
    {
    }
  };

  struct P : Tag
  {
    explicit P(const string& text):Tag("p", text)
    {
    }

    P(initializer_list<Tag> children)
      : Tag("p", children)
    {
    }
    
  };

  struct IMG : Tag
  {
    explicit IMG(const string& url)
      : Tag("img", "")
    {
      attributes.emplace_back(make_pair("src", url));
    }
  };
}

int main1()
{
  using namespace html;

  cout <<

    P {
      IMG {"http://pokemon.com/pikachu.png"}
    }

    << endl;

  getchar();
  return 0;
}